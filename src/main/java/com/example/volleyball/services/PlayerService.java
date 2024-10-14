package com.example.volleyball.services;

import com.example.volleyball.models.Player;
import com.example.volleyball.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlayerService
{
    private final PlayerRepository playerRepository;

    public Player getPlayer(UUID id)
    {
        return playerRepository.getReferenceById(id);
    }

    public List<Player> getAllPlayers()
    {
        return playerRepository.findAll();
    }

    public Player addPlayer(Player player)
    {
        return playerRepository.save(new Player());
    }

    public void deletePlayer(UUID id)
    {
        playerRepository.deleteById(id);
    }

    public Player editPlayer(UUID id, Player editedPlayer)
    {
        Player player = playerRepository.getReferenceById(id);
        player.setName(editedPlayer.getName());
        player.setSurname(editedPlayer.getSurname());
        return playerRepository.save(player);

    }
}
