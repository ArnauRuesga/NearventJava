package com.example.nearventjava.base;

import androidx.annotation.StringRes;

public interface BaseViewContract {

    void showLoading();

    void hideLoading();

    void showMessage(String message);

    void showMessage(@StringRes int resId);
}