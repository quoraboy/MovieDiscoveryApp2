// Generated by Dagger (https://dagger.dev).
package com.moviediscovery.app.presentation.viewmodel;

import com.moviediscovery.app.domain.usecase.AddBookmarkUseCase;
import com.moviediscovery.app.domain.usecase.GetMovieDetailsUseCase;
import com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase;
import com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MovieDetailsViewModel_Factory implements Factory<MovieDetailsViewModel> {
  private final Provider<GetMovieDetailsUseCase> getMovieDetailsUseCaseProvider;

  private final Provider<AddBookmarkUseCase> addBookmarkUseCaseProvider;

  private final Provider<RemoveBookmarkUseCase> removeBookmarkUseCaseProvider;

  private final Provider<IsMovieBookmarkedUseCase> isMovieBookmarkedUseCaseProvider;

  public MovieDetailsViewModel_Factory(
      Provider<GetMovieDetailsUseCase> getMovieDetailsUseCaseProvider,
      Provider<AddBookmarkUseCase> addBookmarkUseCaseProvider,
      Provider<RemoveBookmarkUseCase> removeBookmarkUseCaseProvider,
      Provider<IsMovieBookmarkedUseCase> isMovieBookmarkedUseCaseProvider) {
    this.getMovieDetailsUseCaseProvider = getMovieDetailsUseCaseProvider;
    this.addBookmarkUseCaseProvider = addBookmarkUseCaseProvider;
    this.removeBookmarkUseCaseProvider = removeBookmarkUseCaseProvider;
    this.isMovieBookmarkedUseCaseProvider = isMovieBookmarkedUseCaseProvider;
  }

  @Override
  public MovieDetailsViewModel get() {
    return newInstance(getMovieDetailsUseCaseProvider.get(), addBookmarkUseCaseProvider.get(), removeBookmarkUseCaseProvider.get(), isMovieBookmarkedUseCaseProvider.get());
  }

  public static MovieDetailsViewModel_Factory create(
      Provider<GetMovieDetailsUseCase> getMovieDetailsUseCaseProvider,
      Provider<AddBookmarkUseCase> addBookmarkUseCaseProvider,
      Provider<RemoveBookmarkUseCase> removeBookmarkUseCaseProvider,
      Provider<IsMovieBookmarkedUseCase> isMovieBookmarkedUseCaseProvider) {
    return new MovieDetailsViewModel_Factory(getMovieDetailsUseCaseProvider, addBookmarkUseCaseProvider, removeBookmarkUseCaseProvider, isMovieBookmarkedUseCaseProvider);
  }

  public static MovieDetailsViewModel newInstance(GetMovieDetailsUseCase getMovieDetailsUseCase,
      AddBookmarkUseCase addBookmarkUseCase, RemoveBookmarkUseCase removeBookmarkUseCase,
      IsMovieBookmarkedUseCase isMovieBookmarkedUseCase) {
    return new MovieDetailsViewModel(getMovieDetailsUseCase, addBookmarkUseCase, removeBookmarkUseCase, isMovieBookmarkedUseCase);
  }
}
