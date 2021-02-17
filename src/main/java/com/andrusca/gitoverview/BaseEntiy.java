package com.andrusca.gitoverview;

public class BaseEntiy {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntiy{" +
                "id=" + id +
                '}';
    }

    public boolean isNew(){
        return (this.id == null);
    }
}
