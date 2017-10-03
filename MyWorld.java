import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Robby Tan
 * @version 1.0
 */
public class MyWorld extends World {

    private boolean acceptResponse = true;
    private int countScore1;
    private int countScore2;
    private int countScore3;
    private Label label;
    private Label label2;
    private Label label3;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {
        super(480, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CandidateOne candidateone = new CandidateOne();
        addObject(candidateone,102,100);
        CandidateTwo candidatetwo = new CandidateTwo();
        addObject(candidatetwo,102,250);
        CandidateThree candidatethree = new CandidateThree();
        addObject(candidatethree,102,400);
        label = new Label("Kandidat 1", 30);
        addObject(label,250,100);
        label2 = new Label("Kandidat 2", 30);
        addObject(label2,250,250);
        label3 = new Label("Kandidat 3", 30);
        addObject(label3,250,400);
        ButtonFinalize buttonfinalize = new ButtonFinalize();
        addObject(buttonfinalize, getWidth() / 2, 518);
    }

    public void addScore1() {
        if (acceptResponse) {
            countScore1++;
        }
    }

    public void addScore2() {
        if (acceptResponse) {
            countScore2++;
        }
    }

    public void addScore3() {
        if (acceptResponse) {
            countScore3++;
        }
    }

    public void closeResponse() {
        acceptResponse = false;
        String result;
        if (countScore1 == countScore2 && countScore1 == countScore3) {
            result = "Imbang";
        } else if (countScore1 > countScore2 && countScore1 > countScore3) {
            result = "Pemenang Kandidat 1";
        } else if (countScore2 > countScore1 && countScore2 > countScore3) {
            result = "Pemenang Kandidat 2";
        } else {
            result = "Pemenang Kandidat 3";
        }
        Label finalResult = new Label("Hasil\n" + result , 50);
        addObject(finalResult, getWidth() / 2, 650);
    }
}
