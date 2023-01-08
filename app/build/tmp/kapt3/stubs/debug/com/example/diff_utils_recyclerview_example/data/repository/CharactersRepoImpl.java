package com.example.diff_utils_recyclerview_example.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/diff_utils_recyclerview_example/data/repository/CharactersRepoImpl;", "Lcom/example/diff_utils_recyclerview_example/data/repository/CharactersRepo;", "apiService", "Lcom/example/diff_utils_recyclerview_example/data/remote/ApiService;", "(Lcom/example/diff_utils_recyclerview_example/data/remote/ApiService;)V", "getCharacters", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/diff_utils_recyclerview_example/data/remote/ResponseState;", "Lcom/example/diff_utils_recyclerview_example/domain/models/CharacterModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CharactersRepoImpl implements com.example.diff_utils_recyclerview_example.data.repository.CharactersRepo {
    private final com.example.diff_utils_recyclerview_example.data.remote.ApiService apiService = null;
    
    @javax.inject.Inject()
    public CharactersRepoImpl(@org.jetbrains.annotations.NotNull()
    com.example.diff_utils_recyclerview_example.data.remote.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCharacters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.diff_utils_recyclerview_example.data.remote.ResponseState<com.example.diff_utils_recyclerview_example.domain.models.CharacterModel>>> continuation) {
        return null;
    }
}