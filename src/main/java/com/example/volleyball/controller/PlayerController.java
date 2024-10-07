package com.example.volleyball.controller;

import com.example.volleyball.models.Player;
import com.example.volleyball.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerController
{
    private final PlayerService service;

    @GetMapping("/getAllPlayers/{id}")
    public List<Player> getAllPlayers(@PathVariable int id)
    {
        return List.of(service.getPlayerById(id));
    }

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player player)
    {
        return player;
    }

    @DeleteMapping("/deletePlayer")
    public Player deletePlayer(@RequestBody Player player)
    {
        System.out.println("Usunieto profil gracza: " + player);
        return player;
    }

    @PutMapping
    public Player editPlayer(@RequestBody Player player)
    {
        System.out.println("Edytowane profil gracza: " + player);
        return player;
    }
}
