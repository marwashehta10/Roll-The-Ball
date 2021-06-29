package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.title="Roll The Ball ";
                config.height=600;
                config.width=900;
//              config.addIcon("badlogic.jpg", Files.FileType.Absolute);
		new LwjglApplication(new MyGdxGame(),config);
	}
}
