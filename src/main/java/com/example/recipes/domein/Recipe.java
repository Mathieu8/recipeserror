package com.example.recipes.domein;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Recipe  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @Lob
    private Byte[] image;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients= new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "recipe_category", joinColumns =  @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name ="Category_id"))
    private Set<Category> categories= new HashSet<>();

//    public Long getId() {
//        return id;
//    }


//    public String getDescription() {
//        return description;
//    }

//    public void setDescription(String description) {
//        this.description = description;
//    }


//    public void setPrepTime(Integer prepTime) {
//        this.prepTime = prepTime;
//    }


//    public void setCookTime(Integer cookTime) {
//        this.cookTime = cookTime;
//    }

//    public void setDirections(String directions) {
//        this.directions = directions;
//    }

    public void setNotes(Notes notes) {
        this.notes = notes;
        notes.setRecipe(this);
    }

//    public void setDifficulty(Difficulty difficulty) {
//        this.difficulty = difficulty;
//    }

//    public Set<Ingredient> getIngredients() {
//        return ingredients;
//    }

    public Ingredient addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
        ingredient.setRecipe(this);
        return ingredient;
    }

//    public Set<Category> getCategories() {
//        return categories;
//    }

}
