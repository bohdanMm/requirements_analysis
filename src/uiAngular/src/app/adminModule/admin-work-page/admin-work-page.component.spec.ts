import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminWorkPageComponent } from './admin-work-page.component';

describe('AdminWorkPageComponent', () => {
  let component: AdminWorkPageComponent;
  let fixture: ComponentFixture<AdminWorkPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminWorkPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminWorkPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
