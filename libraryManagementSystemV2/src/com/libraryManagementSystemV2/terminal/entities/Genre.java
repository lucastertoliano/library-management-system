package com.libraryManagementSystemV2.terminal.entities;

public enum Genre {
	
	HISTORY(1, "History"), SCIENCE_FICTION(2, "Science Fiction"), POETRY(3, "Poetry"), 
    FANTASY(4, "Fantasy"), DYSTOPIAN(5, "Dystopian"), BIOGRAPHY(6, "Biography"), 
    SELF_HELP(7, "Self-Help"), TRUE_CRIME(8, "True Crime"), UNDEFINED(0, "Undefined"); 

    private final int option;
    private final String description;

    private Genre(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    //obtain genre based on option value
    public static Genre getGenreByOption(int option) {
        for (Genre genre : Genre.values()) {
            if (genre.getOption() == option) {
                return genre;
            }
        }
        return UNDEFINED;
    }

    //display all options
    public static void printAllGenres() {
        for (Genre genre : Genre.values()) {
            if (genre != UNDEFINED) {
                System.out.println(genre.getOption() + " - " + genre.getDescription());
            }
        }
    }

}
