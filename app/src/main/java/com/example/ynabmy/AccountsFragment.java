package com.example.ynabmy;

import android.accounts.Account;
import android.os.Bundle;
import android.content.Intent;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AccountsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AccountsFragment extends Fragment {
    private Button allAccount;

    public AccountsFragment() {
        super(R.layout.fragment_accounts);
    }

    public static AccountsFragment newInstance() {
        AccountsFragment fragment = new AccountsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_accounts);
        allAccount = (Button) getView().findViewById(R.id.allAccount); //if getView doesnt work try getActivity
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accounts, container, false);
    }

    public void onClickBtn(View v)
    {
        Log.d("xxx", "yyy");
        Toast.makeText(getActivity(),"xxxxx", Toast.LENGTH_LONG).show();
        openNewActivity();
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, getActivity().class);
        startActivity(intent);
    }
}