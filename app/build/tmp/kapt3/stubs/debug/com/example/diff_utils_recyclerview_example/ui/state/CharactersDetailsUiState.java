package com.example.diff_utils_recyclerview_example.ui.state;

import java.lang.System;

/**
 * It's a data class that holds the state of the UI.
 * @property {Boolean} isLoading - This is a boolean property that indicates whether the data is being
 * loaded or not.
 * @property {UiText?} errorMessage - This is a UiText object that will be used to display an error
 * message to the user.
 * @property {List<CharacterModel>?} songs - This is the list of songs that will be displayed in the
 * UI.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/example/diff_utils_recyclerview_example/ui/state/CharactersDetailsUiState;", "", "isLoading", "", "errorMessage", "Lcom/example/diff_utils_recyclerview_example/ui/utils/UiText;", "characters", "Lcom/example/diff_utils_recyclerview_example/domain/models/CharacterModel;", "(ZLcom/example/diff_utils_recyclerview_example/ui/utils/UiText;Lcom/example/diff_utils_recyclerview_example/domain/models/CharacterModel;)V", "getCharacters", "()Lcom/example/diff_utils_recyclerview_example/domain/models/CharacterModel;", "getErrorMessage", "()Lcom/example/diff_utils_recyclerview_example/ui/utils/UiText;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class CharactersDetailsUiState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.example.diff_utils_recyclerview_example.ui.utils.UiText errorMessage = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.diff_utils_recyclerview_example.domain.models.CharacterModel characters = null;
    
    /**
     * It's a data class that holds the state of the UI.
     * @property {Boolean} isLoading - This is a boolean property that indicates whether the data is being
     * loaded or not.
     * @property {UiText?} errorMessage - This is a UiText object that will be used to display an error
     * message to the user.
     * @property {List<CharacterModel>?} songs - This is the list of songs that will be displayed in the
     * UI.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.diff_utils_recyclerview_example.ui.state.CharactersDetailsUiState copy(boolean isLoading, @org.jetbrains.annotations.Nullable()
    com.example.diff_utils_recyclerview_example.ui.utils.UiText errorMessage, @org.jetbrains.annotations.Nullable()
    com.example.diff_utils_recyclerview_example.domain.models.CharacterModel characters) {
        return null;
    }
    
    /**
     * It's a data class that holds the state of the UI.
     * @property {Boolean} isLoading - This is a boolean property that indicates whether the data is being
     * loaded or not.
     * @property {UiText?} errorMessage - This is a UiText object that will be used to display an error
     * message to the user.
     * @property {List<CharacterModel>?} songs - This is the list of songs that will be displayed in the
     * UI.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * It's a data class that holds the state of the UI.
     * @property {Boolean} isLoading - This is a boolean property that indicates whether the data is being
     * loaded or not.
     * @property {UiText?} errorMessage - This is a UiText object that will be used to display an error
     * message to the user.
     * @property {List<CharacterModel>?} songs - This is the list of songs that will be displayed in the
     * UI.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * It's a data class that holds the state of the UI.
     * @property {Boolean} isLoading - This is a boolean property that indicates whether the data is being
     * loaded or not.
     * @property {UiText?} errorMessage - This is a UiText object that will be used to display an error
     * message to the user.
     * @property {List<CharacterModel>?} songs - This is the list of songs that will be displayed in the
     * UI.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CharactersDetailsUiState() {
        super();
    }
    
    public CharactersDetailsUiState(boolean isLoading, @org.jetbrains.annotations.Nullable()
    com.example.diff_utils_recyclerview_example.ui.utils.UiText errorMessage, @org.jetbrains.annotations.Nullable()
    com.example.diff_utils_recyclerview_example.domain.models.CharacterModel characters) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.diff_utils_recyclerview_example.ui.utils.UiText component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.diff_utils_recyclerview_example.ui.utils.UiText getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.diff_utils_recyclerview_example.domain.models.CharacterModel component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.diff_utils_recyclerview_example.domain.models.CharacterModel getCharacters() {
        return null;
    }
}