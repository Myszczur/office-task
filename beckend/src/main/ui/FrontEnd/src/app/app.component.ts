import { Component } from '@angular/core';
import {Customers} from "./customers";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Office Trip';
  public customers: Customers[];
}
