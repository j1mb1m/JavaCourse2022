package by.itacademy.hw20.task1.model.hotel;

public abstract class BaseModel {

    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BaseModel(long id) {
        this.id = id;
    }
}
