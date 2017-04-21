package core;

import processing.core.PGraphics;

import java.util.HashMap;

/**
 * Created by zva on 22/04/17.
 */
public class AssetHandler {

    static final String asset_directory = "data";
    public static final HashMap<String, Asset> assets = loadAssets(asset_directory);

    private static HashMap<String, Asset> loadAssets(String folder_directory) {

        return new HashMap<>();
    }

}
