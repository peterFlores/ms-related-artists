package com.pflores.msrelatedartists.controller;

import com.pflores.msrelatedartists.service.SpotifyRelatedArtistsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/v1")
@RestController
public class RelatedArtistsController {

    @Autowired
    private SpotifyRelatedArtistsService spotifyRelatedArtistsServices;

    @GetMapping("/artists/{id}/related-artists")
    public Map fetchTopTracks(@PathVariable(name = "id") String id) {
        return spotifyRelatedArtistsServices.fetchTopTracks(id);
    }
}
