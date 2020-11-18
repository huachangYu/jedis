package redis.clients.jedis;

import java.util.List;

public class GeoPolygon {
    List<GeoCoordinate> points;

    public GeoPolygon(List<GeoCoordinate> points) {
        this.points = points;
    }

    public List<GeoCoordinate> getPoints() {
        return points;
    }

    public void setPoints(List<GeoCoordinate> points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((points == null) ? 0 : points.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GeoPolygon other = (GeoPolygon) obj;
        if (points == null) {
            if (other.points != null)
                return false;
        } else {
            GeoPolygon that = (GeoPolygon) obj;
            int pointsNum = points.size();
            if (pointsNum != that.getPoints().size()) {
                return false;
            }
            List<GeoCoordinate> thatPoints = that.getPoints();
            for (int i = 0; i < pointsNum; i++) {
                if (!points.get(i).equals(thatPoints.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
