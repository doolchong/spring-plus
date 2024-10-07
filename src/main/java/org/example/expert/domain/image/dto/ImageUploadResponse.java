package org.example.expert.domain.image.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ImageUploadResponse {

    private final String imageUrl;

    public static ImageUploadResponse of(String imageUrl) {
        return new ImageUploadResponse(imageUrl);
    }
}
