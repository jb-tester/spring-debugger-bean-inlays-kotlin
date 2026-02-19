## Spring Debugger: runtime bean inlays for Kotlin classes

Main issue: https://youtrack.jetbrains.com/issue/IDEA-385240

Problems found:
- FIXED https://youtrack.jetbrains.com/issue/IDEA-386062/Spring-Debugger-runtime-bean-inlays-should-be-aligned-with-other-inlays
   - com.mytests.spring.springdebuggerbeaninlayskotlin.conditionalTesting.Bean3
- FIXED https://youtrack.jetbrains.com/issue/IDEA-386063/Spring-Debugger-runtime-bean-inlays-for-Kotlin-duplicated-inlays-for-ambiguous-injecting:
   - com.mytests.spring.springdebuggerbeaninlayskotlin.conditionalTesting.ControllerWithConditionalInjectionCtor
   - com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting.ControllerWIthProfileSpecificCtorInjection
- https://youtrack.jetbrains.com/issue/IDEA-386141/Spring-Debugger-runtime-inlays-for-Kotlin-conditional-components-are-not-shown
   - com.mytests.spring.springdebuggerbeaninlayskotlin.conditionalTesting.ControllerWithConditionalInjectionCtor
   - com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting.ControllerWIthProfileSpecificCtorInjection
- https://youtrack.jetbrains.com/issue/IDEA-386148/Spring-Debugger-add-some-gap-between-same-line-runtime-inlays
   - com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection.ComponentWithNonAmbiguousCtorInjection