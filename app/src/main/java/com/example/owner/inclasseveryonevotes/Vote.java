package com.example.owner.inclasseveryonevotes;

/**
 * Created by Owner on 4/10/2017.
 */

public class Vote {

    String answerTest;
    Integer selection;

    public Vote()
    {

    }

    public Vote(String answerTest, Integer selection)
    {
        this.selection = selection;
        this.answerTest = answerTest;
    }

    public String getAnswerTest()
    {
        return answerTest;
    }

    public void setAnswerTest(String answerTest)
    {
        this.answerTest = answerTest;
    }

    public Integer getSelection()
    {
        return selection;
    }

    public void setSelection(Integer selection)
    {
        this.selection = selection;
    }
}
