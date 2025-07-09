package com.moviediscovery.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MovieDiscoveryApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface MovieDiscoveryApplication_GeneratedInjector {
  void injectMovieDiscoveryApplication(MovieDiscoveryApplication movieDiscoveryApplication);
}
