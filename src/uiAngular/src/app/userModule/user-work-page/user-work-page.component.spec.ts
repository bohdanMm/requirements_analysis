import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserWorkPageComponent } from './user-work-page.component';

describe('UserWorkPageComponent', () => {
  let component: UserWorkPageComponent;
  let fixture: ComponentFixture<UserWorkPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserWorkPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserWorkPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
