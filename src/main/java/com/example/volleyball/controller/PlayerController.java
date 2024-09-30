package com.example.volleyball.controller;

import com.example.volleyball.models.Player;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController
{
    @GetMapping("/player/{playerId}" )
    public Player getPlayer(@PathVariable int playerId)
    {
        return new Player(playerId, "Ryszard", "Gortat");
    }

    @PostMapping("/player")
    public Player addPlayer(@RequestBody Player player)
    {
        return player;
    }

    @DeleteMapping("/player")
    public Player deletePlayer(@RequestBody Player player)
    {
        return player;
    }

    @PutMapping
    public Player editPlayer(@RequestBody Player player)
    {
        return player;
    }
}
