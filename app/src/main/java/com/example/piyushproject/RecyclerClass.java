package com.example.piyushproject;

public class RecyclerClass {

    private String comptext,titletext,lastdatehint,branchhint;

    RecyclerClass( String comptext,  String titletext,  String lastdatehint,  String brachhint){

       this.comptext = comptext;

       this.titletext = titletext;

       this.lastdatehint = lastdatehint;

       this.branchhint = branchhint;

    }



    public String getComptext() {
        return comptext;
    }



    public String getTitletext() {
        return titletext;
    }



    public String getLastdatehint() {
        return lastdatehint;
    }



    public String getBranchhint() {
        return branchhint;
    }
}
