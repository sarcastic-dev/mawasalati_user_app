package com.example.mawasalatiuserapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScheduledBus implements Parcelable {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("bus_name")
    @Expose
    private String bus_name;

    @SerializedName("origin")
    @Expose
    private String origin;

    @SerializedName("destination")
    @Expose
    private String destination;

    @SerializedName("pickup_point")
    @Expose
    private String pickup_point;

    @SerializedName("drop_point")
    @Expose
    private String drop_point;

    @SerializedName("departure_time")
    @Expose
    private String departure_time;

    @SerializedName("arrival_time")
    @Expose
    private String arrival_time;

    @SerializedName("duration")
    @Expose
    private String duration;

    @SerializedName("seats")
    @Expose
    private Integer seats;

    @SerializedName("price")
    @Expose
    private Integer price;

    @SerializedName("rating")
    @Expose
    private Integer rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPickup_point() {
        return pickup_point;
    }

    public void setPickup_point(String pickup_point) {
        this.pickup_point = pickup_point;
    }

    public String getDrop_point() {
        return drop_point;
    }

    public void setDrop_point(String drop_point) {
        this.drop_point = drop_point;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    protected ScheduledBus(Parcel in) {
        id = in.readInt();
        bus_name = in.readString();
        origin = in.readString();
        destination = in.readString();
        pickup_point = in.readString();
        drop_point = in.readString();
        departure_time = in.readString();
        arrival_time = in.readString();
        duration = in.readString();
        if (in.readByte() == 0) {
            seats = null;
        } else {
            seats = in.readInt();
        }
        if (in.readByte() == 0) {
            price = null;
        } else {
            price = in.readInt();
        }
        if (in.readByte() == 0) {
            rating = null;
        } else {
            rating = in.readInt();
        }
    }

    public static final Creator<ScheduledBus> CREATOR = new Creator<ScheduledBus>() {
        @Override
        public ScheduledBus createFromParcel(Parcel in) {
            return new ScheduledBus(in);
        }

        @Override
        public ScheduledBus[] newArray(int size) {
            return new ScheduledBus[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(bus_name);
        dest.writeString(origin);
        dest.writeString(destination);
        dest.writeString(pickup_point);
        dest.writeString(drop_point);
        dest.writeString(departure_time);
        dest.writeString(arrival_time);
        dest.writeString(duration);
        if (seats == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(seats);
        }
        if (price == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(price);
        }
        if (rating == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(rating);
        }
    }
}
