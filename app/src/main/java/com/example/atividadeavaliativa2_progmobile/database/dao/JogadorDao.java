package com.example.atividadeavaliativa2_progmobile.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;
import androidx.room.Query;
import com.example.atividadeavaliativa2_progmobile.database.entity.Jogador;
import java.util.List;

@Dao
public interface JogadorDao {

    @Delete
    void excluiJogador(Jogador jogador);

    @Insert
    void insereJogador(Jogador jogador);

    @Update
    void atualizaJogador(Jogador jogador);

    @Query("SELECT * FROM Jogador WHERE idJogador = :idJogador LIMIT 1")
    Jogador encontreJogadorPorId(int idJogador);

    @Query("SELECT * FROM Jogador WHERE nickname = :nickname LIMIT 1")
    Jogador encontreJogadorPorNickName(String nickname);

    @Query("SELECT * FROM Jogador ORDER BY nome ASC")
    List<Jogador> selecionaTodosJogadores();

    @Insert
    long insereJogadorEPegaId(Jogador jogador);

    @Query("SELECT * FROM Jogador")
    List<Jogador> getAllJogadores();

    @Query("SELECT * FROM Jogador WHERE idJogador = :id")
    Jogador getJogadorById(int id);

}
