package com.example.volleyball.services;

import com.example.volleyball.models.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerService
{
    public Player getPlayerById(int id)
    {
        return new Player(id, "Bartek", "Kurek");
    }

    public Player addPlayer(Player player)
    {
        return new Player(player.getId(), "Bartek", "Kurek");
    }

    public Player deletePlayer(Player player)
    {
        return player;
    }

    public Player editPlayer(Player player)
    {
        return player;
    }
}
