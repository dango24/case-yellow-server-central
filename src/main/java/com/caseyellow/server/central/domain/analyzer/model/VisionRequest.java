package com.caseyellow.server.central.domain.analyzer.model;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.caseyellow.server.central.common.Utils.createImageBase64Encode;

public class VisionRequest {

    private Image image;
    private ImageContext imageContext;
    private List<Feature> features;

    public VisionRequest() {
        imageContext = ImageContext.createImageContextDefaultValues();
        features = Arrays.asList(Feature.createDefaultFeature());
    }

    public VisionRequest(String imgPath) throws IOException {
        this();
        image = new Image(new String(createImageBase64Encode(imgPath), "UTF-8"));
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ImageContext getImageContext() {
        return imageContext;
    }

    public void setImageContext(ImageContext imageContext) {
        this.imageContext = imageContext;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
