import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author Robby Tan
 * @version 1.0
 */
public class CandidateOne extends Actor
{
    /**
     * Act - do whatever the CandidateOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            ((MyWorld) getWorld()).addScore1();
        }
    }    
}
