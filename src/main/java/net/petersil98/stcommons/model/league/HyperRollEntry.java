package net.petersil98.stcommons.model.league;

public class HyperRollEntry extends AbstractEntry {

    public static final HyperRollEntry UNRANKED = new HyperRollEntry();

    private RatedTier ratedTier;
    private int ratedRating;

    public void setRatedTier(RatedTier ratedTier) {
        this.ratedTier = ratedTier;
    }

    public void setRatedRating(int ratedRating) {
        this.ratedRating = ratedRating;
    }

    public RatedTier getRatedTier() {
        return ratedTier;
    }

    public int getRatedRating() {
        return ratedRating;
    }
}