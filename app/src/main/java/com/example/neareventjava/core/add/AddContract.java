package com.example.neareventjava.core.add;

import com.example.neareventjava.base.BaseListenerContract;
import com.example.neareventjava.base.BasePresenterContract;
import com.example.neareventjava.base.BaseViewContract;
import com.example.neareventjava.model.UserPlant;

public interface AddContract {
    interface View extends BaseViewContract {
        void setNameError(int error);

        void plantAdded(int message, UserPlant plant);
    }

    interface Presenter extends BasePresenterContract {
        void addPlant(UserPlant plant);
    }

    interface Interactor {
        void performAddPlant(UserPlant plant);
    }

    interface Listener extends BaseListenerContract {
        void onSuccess(int message, UserPlant plant);
        void onFailure(String message);
    }
}