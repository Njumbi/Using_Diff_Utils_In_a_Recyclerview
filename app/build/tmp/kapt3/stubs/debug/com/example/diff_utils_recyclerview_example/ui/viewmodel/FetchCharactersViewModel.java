package com.example.diff_utils_recyclerview_example.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/example/diff_utils_recyclerview_example/ui/viewmodel/FetchCharactersViewModel;", "Landroidx/lifecycle/ViewModel;", "charactersRepo", "Lcom/example/diff_utils_recyclerview_example/data/repository/CharactersRepo;", "(Lcom/example/diff_utils_recyclerview_example/data/repository/CharactersRepo;)V", "_charactersDetailsUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/diff_utils_recyclerview_example/ui/state/CharactersDetailsUiState;", "charactersDetailsUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getCharactersDetailsUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "charactersList", "", "Lcom/example/diff_utils_recyclerview_example/domain/models/CharacterDetails;", "getCharactersRepo", "()Lcom/example/diff_utils_recyclerview_example/data/repository/CharactersRepo;", "getCharacters", "", "app_debug"})
public final class FetchCharactersViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.diff_utils_recyclerview_example.data.repository.CharactersRepo charactersRepo = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.diff_utils_recyclerview_example.ui.state.CharactersDetailsUiState> _charactersDetailsUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.diff_utils_recyclerview_example.ui.state.CharactersDetailsUiState> charactersDetailsUiState = null;
    private final java.util.List<com.example.diff_utils_recyclerview_example.domain.models.CharacterDetails> charactersList = null;
    
    @javax.inject.Inject()
    public FetchCharactersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.diff_utils_recyclerview_example.data.repository.CharactersRepo charactersRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.diff_utils_recyclerview_example.data.repository.CharactersRepo getCharactersRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.diff_utils_recyclerview_example.ui.state.CharactersDetailsUiState> getCharactersDetailsUiState() {
        return null;
    }
    
    public final void getCharacters() {
    }
}