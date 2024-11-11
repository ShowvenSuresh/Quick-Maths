
package com.mycompany.quickmaths;


public class Queue {
    private int rear=0;
    private int front=0;
    private int capacity;
    private QuestionSet[] question;
    
    public Queue(int capacity){
        this.capacity= capacity;
        question= new QuestionSet[capacity];
    }
    
    public void enQueue(QuestionSet qs){
        if (rear==capacity-1){
            System.out.println("Quses is full");
        }
        
        else {
            question[rear]= qs;
            rear++;
        }
    }
    
    public QuestionSet deQueue(){
        if(rear==0){
            System.out.println("Queue is empty");
        }
        
        else{
            QuestionSet q = question[front];
            for(int i=0;i<rear-1;i++){
                question[i]=question[i+1];
            }
            rear --;
        }
        return q;
    }
    
    
}
