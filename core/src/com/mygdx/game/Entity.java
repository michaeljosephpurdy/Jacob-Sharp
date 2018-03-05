package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Entity {
    private Vector2 coordinates;
    private Texture sprite;

    public Entity()
    {

    }

    public Entity(float x, float y, String pathToTexture)
    {
        coordinates = new Vector2(x, y);
        sprite = new Texture(pathToTexture);
    }

    public void draw(SpriteBatch spriteBatch)
    {
        spriteBatch.draw(sprite, coordinates.x, coordinates.y);
    }

    public void moveLeft()
    {
        coordinates.add(-1, 0);
    }

    public void moveRight()
    {
        coordinates.add(1, 0);
    }

    public void moveUp()
    {
        coordinates.add(0, -1);
    }

    public void moveDown()
    {
        coordinates.add(0, 1);
    }

    public void dispose()
    {
        coordinates = null;
        sprite.dispose();
    }
}