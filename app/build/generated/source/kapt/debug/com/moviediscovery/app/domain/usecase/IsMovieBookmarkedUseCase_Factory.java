// Generated by Dagger (https://dagger.dev).
package com.moviediscovery.app.domain.usecase;

import com.moviediscovery.app.domain.repository.MovieRepository;
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
public final class IsMovieBookmarkedUseCase_Factory implements Factory<IsMovieBookmarkedUseCase> {
  private final Provider<MovieRepository> repositoryProvider;

  public IsMovieBookmarkedUseCase_Factory(Provider<MovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public IsMovieBookmarkedUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static IsMovieBookmarkedUseCase_Factory create(
      Provider<MovieRepository> repositoryProvider) {
    return new IsMovieBookmarkedUseCase_Factory(repositoryProvider);
  }

  public static IsMovieBookmarkedUseCase newInstance(MovieRepository repository) {
    return new IsMovieBookmarkedUseCase(repository);
  }
}
