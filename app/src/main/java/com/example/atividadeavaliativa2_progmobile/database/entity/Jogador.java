package com.example.atividadeavaliativa2_progmobile.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;
import androidx.room.Index;

@Entity(
    indices = {@Index(value = {"nickname"}, unique = true)}
)
public class Jogador {

    @PrimaryKey(autoGenerate = true)
    public int idJogador;

    @ColumnInfo(name = "nome")
    public String nome;

    @ColumnInfo(name = "nickname")
    public String nickname;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "dataNascimento")
    public String dataNascimento;

}

