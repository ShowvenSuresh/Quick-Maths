/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickmaths;

/**
 *
 * @author USER
 */
public class QuestionSet {
    public String question = null;
    public int selection1 = 0;
    public int selection2 = 0;
    public int selection3 = 0;
    public int selection4 = 0;
    public int anser = 0;
    
    public QuestionSet(String question, int s1, int s2,int s3,int s4,int ans){
        this.question = question;
        selection1 = s1;
        selection2 = s2;
        selection3 = s3;
        selection4 = s4;
        anser = ans;
    } 

}
