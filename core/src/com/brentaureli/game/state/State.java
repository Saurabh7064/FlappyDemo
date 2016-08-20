package com.brentaureli.game.state;

/**
 * Created by 611148870 on 20/08/2016.
 */
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Brent on 6/26/2015.
 */
public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    public State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }

    protected abstract void handleInput();
    public abstract void update(float dt); // deltatime -its a diff bet 1 freame render to another
    public abstract void render(SpriteBatch sb);//SpriteBatch is used render everything on screen
    public abstract void dispose();
}