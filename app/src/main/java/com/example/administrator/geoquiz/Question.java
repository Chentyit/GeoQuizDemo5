package com.example.administrator.geoquiz;

/**
 * Created by Administrator on 2018/3/14 0014.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean isCheat;

    public Question(int textResId, boolean answerTrue, boolean ischeat) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        isCheat = ischeat;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public boolean isCheat() {
        return isCheat;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setCheat(boolean cheat) {
        isCheat = cheat;
    }
}
