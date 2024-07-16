package com.pflores.msrelatedartists.service;

import com.pflores.msrelatedartists.client.ISpotifyClientRelatedArtists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SpotifyRelatedArtistsService {

    @Autowired
    private ISpotifyClientRelatedArtists spotifyClientRelatedArtists;

    public Map<String, Object> fetchTopTracks(String id) {
        return spotifyClientRelatedArtists.fetchRelatedArtists(id);
    }
}
