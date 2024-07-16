package com.pflores.msrelatedartists.client;


import com.pflores.msrelatedartists.configuration.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "spotifyClient", url = "${spotify.api.url}", configuration = FeignClientConfiguration.class)
public interface ISpotifyClientRelatedArtists {

    @GetMapping(value = "v1/artists/{id}/related-artists")
    Map<String, Object> fetchRelatedArtists(@PathVariable(name = "id") String id);
}