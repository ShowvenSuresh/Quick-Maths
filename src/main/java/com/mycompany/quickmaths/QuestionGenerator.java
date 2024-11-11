/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickmaths;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author USER
 */
public class QuestionGenerator {
   
    public QuestionSet generateAdditionQuestion(int maxNumber){
        Random random = new Random();
        int randomNum1 = random.nextInt(maxNumber);
        int randomNum2 = random.nextInt(maxNumber);
        int ans = randomNum1 + randomNum2;
        String question = randomNum1 + " + " + randomNum2 + " = ?";
        
        int[] selection = new int[4];
        boolean insertCorrectAns = true;
        int i = 0;
        do{
            if(insertCorrectAns && random.nextBoolean()){
                selection[i] = ans;
                insertCorrectAns = false;
                i++;
            }
            else{
                boolean isRepeat = false;
                int randomNum = random.nextInt(maxNumber);
                if(random.nextBoolean())
                    selection[i] = ans + randomNum;
                else
                    selection[i] = ans - randomNum;            
                for(int j = 0; j<4; j++){
                    if(selection[i] == selection[j]){
                        isRepeat = true;
                        break;
                    }
                }
                if(!isRepeat)
                    i++;
                System.out.println(!isRepeat + ":" +selection[i]);
            }
        }while(i<4);
        
        return new QuestionSet(question, selection[0],selection[1],selection[2],selection[3],ans);
    }
    
    public QuestionSet generateSubstractionQuestion(int maxNumber){
        Random random = new Random();
        int randomNum1 = random.nextInt(maxNumber);
        int randomNum2 = random.nextInt(maxNumber);
        int ans = randomNum1 - randomNum2;
        String question = randomNum1 + " - " + randomNum2 + " = ?";
        
        int[] selection = new int[4];
        boolean insertCorrectAns = true;
        int i = 0;
        do{
            if(insertCorrectAns && random.nextBoolean()){
                selection[i] = ans;
                insertCorrectAns = false;
                i++;
            }
            else{
                boolean isRepeat = false;
                int randomNum = random.nextInt(maxNumber);
                if(random.nextBoolean())
                    selection[i] = ans + randomNum;
                else
                    selection[i] = ans - randomNum;            
                for(int j = 0; j<4; j++){
                    if(selection[i] == selection[j]){
                        isRepeat = true;
                        break;
                    }
                }
                if(!isRepeat)
                    i++;
                System.out.println(!isRepeat + ":" +selection[i]);
            }
        }while(i<4);
        
        return new QuestionSet(question, selection[0],selection[1],selection[2],selection[3],ans);
    }
    
    public QuestionSet generateMultiplicationQuestion(int maxNumber){
        Random random = new Random();
        int randomNum1 = random.nextInt(maxNumber);
        int randomNum2 = random.nextInt(maxNumber);
        int ans = randomNum1 * randomNum2;
        String question = randomNum1 + " x " + randomNum2 + " = ?";
        
        int[] selection = new int[4];
        boolean insertCorrectAns = true;
        int i = 0;
        do{
            if(insertCorrectAns && random.nextBoolean()){
                selection[i] = ans;
                insertCorrectAns = false;
                i++;
            }
            else{
                boolean isRepeat = false;
                int randomNum = random.nextInt(maxNumber);
                if(random.nextBoolean())
                    selection[i] = ans + randomNum;
                else
                    selection[i] = ans - randomNum;            
                for(int j = 0; j<4; j++){
                    if(selection[i] == selection[j]){
                        isRepeat = true;
                        break;
                    }
                }
                if(!isRepeat)
                    i++;
                System.out.println(!isRepeat + ":" +selection[i]);
            }
        }while(i<4);
        
        return new QuestionSet(question, selection[0],selection[1],selection[2],selection[3],ans);
    }
    
    public QuestionSet generateDivisionQuestion(int maxNumber){
        Random random = new Random();
        int randomNum1 = random.nextInt(maxNumber);
        int ans = random.nextInt(maxNumber/10);
        int randomNum2 = randomNum1 * ans;
        String question = randomNum1 + " / " + randomNum2 + " = ?";
        
        int[] selection = new int[4];
        boolean insertCorrectAns = true;
        int i = 0;
        do{
            if(insertCorrectAns && random.nextBoolean()){
                selection[i] = ans;
                insertCorrectAns = false;
                i++;
            }
            else{
                boolean isRepeat = false;
                int randomNum = random.nextInt(maxNumber);
                if(random.nextBoolean())
                    selection[i] = ans + randomNum;
                else
                    selection[i] = ans - randomNum;            
                for(int j = 0; j<4; j++){
                    if(selection[i] == selection[j]){
                        isRepeat = true;
                        break;
                    }
                }
                if(!isRepeat)
                    i++;
                System.out.println(!isRepeat + ":" +selection[i]);
            }
        }while(i<4);
        
        return new QuestionSet(question, selection[0],selection[1],selection[2],selection[3],ans);
    }
}
