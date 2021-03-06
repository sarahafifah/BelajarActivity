package com.example.belajaractivity.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.belajaractivity.FirstActivity;
import com.example.belajaractivity.R;
import com.example.belajaractivity.base.BaseFragment;



public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {

    TextView userText;
    TextView passText;
    Bundle bundle;


    public ProfileFragment(Bundle bundle) {
        this.bundle = bundle;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();

        userText = fragmentView.findViewById(R.id.user_text);
        passText = fragmentView.findViewById(R.id.pass_text);

        mPresenter.getUserInfo(bundle);

        setTitle("My Profile");

        return fragmentView;
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showUser(String email, String password) {
            userText.setText(email);
            passText.setText(password);
    }

}
