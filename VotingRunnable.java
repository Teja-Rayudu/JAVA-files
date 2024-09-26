public class VotingRunnable implements Runnable{
    private Design d;
    protected boolean doStop = false;
    public VotingRunnable(Design d){this.d=d;}
    @Override
    public void run(){
        System.out.println("The voting going on for design "+ d.getName());
        d.getVotes().add(1L);
    }
}