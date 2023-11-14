package app.com.fag.game;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    private ArrayList<String> lettersList = new ArrayList<String>();
    private final String[] listaFacil = { "ELEFANTE", "PINGUIM", "RAPOSA", "COELHO", "TARTARUGA", "LONTRA", "MORCEGO",
            "LAGARTO", "GORILA", "MACACO", "CANGURU" };
    private final String[] listaMedio = { "ARAPONGA", "UIRAPURU", "CUTIA", "CAPIVARA", "MARITACA", "ARIRANHA",
            "JACUTINGA", "GUAXINIM", "CODORNA", "TEXUGO" };
    private final String[] listaDificil = { "AXOLOTE", "QUATI", "UACARI", "QUIRIQUIRI", "CURUCACA", "ALBATROZ",
            "TOUPEIRA", "GALEOPITECO" };
    private Game game;
    private int wrongLettersCount = 0;

    @GetMapping("/start")
    public String startGame(@RequestParam(name = "difficulty", defaultValue = "select") String difficulty,
            Model model) {
        lettersList.clear();
        String targetWord = "";
        switch (difficulty) {
            case "select": {
                targetWord = "";
                break;
            }
            case "easy": {
                targetWord = listaFacil[(int) (Math.random() * listaFacil.length)];
                break;
            }
            case "medium": {
                targetWord = listaMedio[(int) (Math.random() * listaMedio.length)];
                break;
            }
            case "hard": {
                targetWord = listaDificil[(int) (Math.random() * listaDificil.length)];
                break;
            }
            default:
                throw new IllegalArgumentException("Nível de dificuldade inválido: " + difficulty);
        }
        game = new Game(targetWord);
        wrongLettersCount = 0;
        model.addAttribute("lettersList", lettersList);
        model.addAttribute("game", game);
        model.addAttribute("wrongLettersCount", wrongLettersCount);
        return "game";
    }

    @PostMapping("/guess")
    public String guessWord(@RequestParam("letter") char letter, Model model) {
        String guessedWord = updateGuessedWord(letter);
        game.setGuessedWord(guessedWord);
        model.addAttribute("game", game);
        lettersList.add(String.valueOf(letter));
        if (!game.getTargetWord().contains(String.valueOf(letter))) {
            wrongLettersCount++;
            if (wrongLettersCount >= 8) {
                return "lose";
            }
        }
        if (game.getGuessedWord().equals(game.getTargetWord())) {
            return "win";
        }
        model.addAttribute("lettersList", lettersList);
        model.addAttribute("wrongLettersCount", wrongLettersCount);
        return "game";
    }

    private String updateGuessedWord(char letter) {
        //char letter = Character.toUpperCase(letter);
        char[] guessedWordChars = game.getGuessedWord().toCharArray();
        char[] targetWordChars = game.getTargetWord().toCharArray();
        for (int i = 0; i < targetWordChars.length; i++) {
            if (targetWordChars[i] == letter) {
                guessedWordChars[i] = letter;
            }
        }
        
        return new String(guessedWordChars);
    }
    
    
}