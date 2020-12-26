package com.amirmohammed.seniorframgnets;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ChatsFragment extends Fragment {
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button = view.findViewById(R.id.chats_fragment_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(requireContext(), "Hello ", Toast.LENGTH_SHORT).show(); // ctrl + p
                showCustomDialog();
            }
        });
    }

    private void showAlertDialog() {
        new AlertDialog.Builder(requireContext())
                .setTitle("Warning")
                .setMessage("برجاء دقع مستجقات المبرمج")
                .setCancelable(false)
                .setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("Cancel", null)
                .show();

    }

    public void showCustomDialog() {
        getChildFragmentManager()
                .beginTransaction()
                .add(new CustomDialogFragment(), "CustomDialog")
                .commit();

//        getSupportFragmentManager().findFragmentByTag("CustomDialog")
    }

}