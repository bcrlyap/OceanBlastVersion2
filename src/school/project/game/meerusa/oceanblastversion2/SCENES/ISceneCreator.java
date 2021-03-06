/**
 * ISceneCreator.java
 * Jan 11, 2013
 * 3:04:41 PM
 *
 * @author B. Carla Yap 
 * email: bcarlayap@ymail.com
 *
 */

package school.project.game.meerusa.oceanblastversion2.SCENES;

import org.andengine.entity.scene.Scene;

import school.project.game.meerusa.oceanblastversion2.SceneManager;

public interface ISceneCreator {
	
	public void createScene(SceneManager sceneManager);
	public Scene getScene();

}

