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
        // data/assets/asset1.png
        // data/assets/asset2.png ... asset3.jpg
        //File f = new File(asset1.png)
        // Asset = loadAsset(asset1.png);
        //assets.put("asset1", asset)
        //assets.get("asset1")
        return new HashMap<>();
    }

}
