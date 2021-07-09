package com.example.langu.Models;

public class NumbersModel {

    private String englishWord;
    private String hindiWord;
    private int image;

    public NumbersModel(String englishWord, String hindiWord,int image) {
        this.englishWord = englishWord;
        this.hindiWord = hindiWord;
        this.image=image;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getHindiWord() {
        return hindiWord;
    }

    public void setHindiWord(String hindiWord) {
        this.hindiWord = hindiWord;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
