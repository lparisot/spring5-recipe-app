package com.lpa.spring5recipeapp.converters;

import com.lpa.spring5recipeapp.commands.NotesCommand;
import com.lpa.spring5recipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class NotesToNotesCommand implements Converter<Notes, NotesCommand> {
    @Synchronized
    @Nullable
    @Override
    public NotesCommand convert(Notes notes) {
        return null;
    }
}
