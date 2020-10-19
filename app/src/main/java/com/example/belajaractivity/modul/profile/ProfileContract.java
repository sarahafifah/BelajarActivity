package com.example.belajaractivity.modul.profile;

import android.os.Bundle;
import com.example.belajaractivity.base.BasePresenter;
import com.example.belajaractivity.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void showUser(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void getUserInfo(Bundle bundle);
    }
}
