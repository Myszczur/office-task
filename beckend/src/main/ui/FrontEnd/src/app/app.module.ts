import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {GuideListComponent} from './guide-list/guide-list.component';
import {HttpClientModule} from "@angular/common/http";
import { CreateGuideComponent } from './create-guide/create-guide.component';
import {FormsModule} from "@angular/forms";
import { UpdateGuideComponent } from './update-guide/update-guide.component';

@NgModule({
  declarations: [
    AppComponent,
    GuideListComponent,
    CreateGuideComponent,
    UpdateGuideComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
