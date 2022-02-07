package model;

public class Category {

    private String name;
    private Category parentCategory;


    public Category(String name, Category parentCategory) {
        this.name = name;
        this.parentCategory = parentCategory;
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", parentCategory=" + parentCategory +
                '}';
    }
}
