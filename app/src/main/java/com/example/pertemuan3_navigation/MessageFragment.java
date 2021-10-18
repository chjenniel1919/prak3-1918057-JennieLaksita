package com.example.pertemuan3_navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.pertemuan3_navigation.R.layout.fragment_chat;
import static com.example.pertemuan3_navigation.R.layout.fragment_message;

public class MessageFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(fragment_message, container, false);
    }
}

